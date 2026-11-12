# Files and directories with `java.io.File`

A `File` object represents the path of a file or directory. With `new File("myfile.txt")`, Java stores a path relative to the working directory. With `new File("MyDocs", "myfile.txt")`, Java combines the MyDocs parent directory with the myfile.txt filename. Both constructors can represent paths that do not exist yet.

## Inspecting paths and file metadata

- `String getPath()` returns the path stored by the object, which may be relative or absolute.
- `String getAbsolutePath()` returns the absolute path.
- `String getParent()` returns the parent portion of the path, or `null` if the path has no parent. For example, calling it on `new File("myfile.txt")` returns `null`.
- `long lastModified()` returns the last modification time in milliseconds since January 1, 1970 UTC, or `0` if the file does not exist or an I/O error occurs.
- `long length()` returns the size of a file in bytes. An empty or nonexistent file can yield `0`. For a directory, the value is unspecified.

## Modifying files and working with directories

- `boolean renameTo(File destination)` attempts to rename or move the file to the specified path and reports whether it succeeded.
- `boolean delete()` attempts to delete the file or empty directory and reports whether it succeeded.
- `boolean mkdir()` attempts to create a directory and reports whether it succeeded. Use `mkdirs()` to create missing parent directories as well.
- `String[] list()` returns the names of files and subdirectories, or `null` if the path is not a directory or an I/O error occurs.

## Checking a path

- `boolean exists()` reports whether the file or directory exists.
- `boolean canRead()` and `boolean canWrite()` report whether the program can read or write the existing path.
- `boolean isFile()` checks whether the path refers to a regular file.
- `boolean isDirectory()` checks whether the path refers to a directory.
- `boolean isAbsolute()` checks whether the path is absolute.
- `boolean isHidden()` checks whether the file is hidden according to the operating system rules.

## Example

`FileExample.java` prints the relative and absolute paths for both examples and checks whether they exist. If you run the program from the repository root, both relative paths resolve from that directory.
