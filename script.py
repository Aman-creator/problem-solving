from azure.storage.filedatalake import DataLakeServiceClient
# install the following package 
# pip install azure-storage-file-datalake 

# Get the below details from your storage account
storage_account_name = ""
storage_account_key = ""
container_name = ""
directory_name = ""

service_client = DataLakeServiceClient(account_url="{}://{}.dfs.core.windows.net".format(
        "https", storage_account_name), credential=storage_account_key)

file_system_client = service_client.get_file_system_client(file_system=container_name)
dir_client = file_system_client.get_directory_client(directory_name)
dir_client.create_directory()
data = """
        Sample data for testing. 
        This is a multiline text for testing the ADLS Gen2 file system operations.
"""

file_client = dir_client.create_file("sampledata.txt")
file_client.append_data(data, 0, len(data))
file_client.flush_data(len(data))