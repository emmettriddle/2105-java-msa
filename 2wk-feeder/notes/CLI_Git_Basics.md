# Day 2 Notes  

### File System
- How files are stored, named and accessed.  
- Tree-like structure
    - Root (or top level) directory 
    - Then other directories are nested inside

- In Unix - the root directory is represented by `/`  
- In Windows = `C:\`
- Not every user will have access to the entire file system

### Paths  
- When structure can be represented as a tree - we can refer to what we call **paths**  

**Absolute Path**: "measured" from the root directory (or a globally fixed point)  
`C:\Programs\Java\jdk.....`  
`/Users/Revature/Documents/text.txt`  

**Relative Paths**: "measured" from the location of another file or directory (*relative to another point*)  
`../styles/stylesheet.css`  

`.` -> represents the current directory  
`..` -> represents the parent directory
> subdirectories are divided by the `/`

- To execute commands for your OS:
    - Command Prompt (cmd)
    - PowerShell
    - Unix Shell
    - Terminal  
    - GitBash -> what we will be using. 

## Git
- version control tool
- Allows for safer collaboration between teams
- Many different hosting tools
    - GitHub, GitLab, SourceTree, etc.
- Git is the underlying software that these platforms rely on
    - but it is not the platform itself. 
