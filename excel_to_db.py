import pandas as pd
import pyodbc

# Import CSV
data = pd.read_excel (r'C:\Users\Aman.Raj\Documents\products1.xlsx', engine='openpyxl')   
"""pd.read_excel(r'filename.xlsx', engine='openpyxl')"""
df = pd.DataFrame(data)

# Connect to SQL Server
conn = pyodbc.connect("Driver={SQL Server Native Client 11.0};"               
               "Server=DESKTOP-FSI0R5G;"
               "Database=experintdb;"
               "username=webuser;"
               "password=Check4SW;"
               "Trusted_Connection=yes;")

cursor = conn.cursor()

# Create Table

"""cursor.execute('''
		CREATE TABLE products (
			product_id int primary key,
			product_name nvarchar(50),
			price int
			)
               ''')"""

# Insert DataFrame to Table
for row in df.itertuples():
    cursor.execute('''
                INSERT INTO products (product_id, product_name, price)
                VALUES (?,?,?)
                ''',
                row.product_id, 
                row.product_name,
                row.price
                )
conn.commit()