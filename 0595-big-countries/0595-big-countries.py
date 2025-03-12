import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    df=world
    df1=df[(df['area']>=3000000) | (df['population']>=25000000)]
    return df1[['name','population','area']]