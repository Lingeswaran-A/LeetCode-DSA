class Solution:
    def minimumDiameterAfterMerge(self, edges1: List[List[int]], edges2: List[List[int]]) -> int:
        n=len(edges1)+1
        m=len(edges2)+1
        def build_adj(edges):
            adj=defaultdict(list)
            for n1,n2 in edges:
                adj[n1].append(n2)
                adj[n2].append(n1)
            return adj
        adj1=build_adj(edges1)
        adj2=build_adj(edges2)

        #dfs for getting the diameter , returns max_diameter and max_leaf_paths
        def get_diameter(cur, par, adj):
            # Initialize max diameter and paths
            max_d=0
            max_child_paths=[0, 0]  # Maintain top two maximum child paths
            for nei in adj[cur]:  # Iterate through neighbors of the current node
                if nei==par:  # In case if neighbor is parent then skip the parent node
                    continue
                # Recursive call to find diameter and maximum leaf path of the subtree
                nei_d,nei_max_leaf_path=get_diameter(nei,cur,adj)
                # Update the maximum diameter
                max_d = max(max_d, nei_d)
                # Push the current path length into the max heap
                heappush(max_child_paths, nei_max_leaf_path)
                # Keep only the two largest paths
                if len(max_child_paths)>2:
                    heappop(max_child_paths)
            # Update the maximum diameter with the sum of the two largest paths
            max_d = max(max_d,sum(max_child_paths))
            # Return the maximum diameter and the largest leaf path (height) from the current node
            return [max_d, 1 + max(max_child_paths)]
        d1,_=get_diameter(0,-1,adj1)
        d2,_=get_diameter(0,-1,adj2)
        return max(d1,d2,ceil(d1/2)+ceil(d2/2)+1)