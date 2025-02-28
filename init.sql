CREATE DATABASE TaskDB;
GO

USE TaskDB;
GO

CREATE TABLE Tasks (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    TaskName NVARCHAR(255) NOT NULL,
    IsDeleted BIT NOT NULL DEFAULT 0
);
GO

INSERT INTO Tasks (TaskName, IsDeleted)
VALUES
    (N'Task 1', 0),
    (N'Task 2', 1),
    (N'Task 3', 0);
GO