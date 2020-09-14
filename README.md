# unzipPasswordFile

To test this code, use Postman.
Step 1. Use the `POST` function on `http://localhost:8080/unzipFile` after running the project
Step 2. Click on `Body` and then on `form-data`
Step 3. Write 'filepath' under key and keep the datatype as text
Step 4. In value give the location of the .zip file with the filename and extension.
          Ex.: /home/user/Desktop/ProtectedFile.zip
Step 5. If the given location reprints the file is successfully extracted
