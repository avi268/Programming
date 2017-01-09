/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP 1000 [CHANNEL_NAME]
      ,[CHANNEL_ID]
      ,CH.[VIDEO_ID]
     ,VIDEO_NAME
  FROM [Myassignment].[dbo].[Assignment.Channel] as CH

  join dbo.[Assignment.Video] as VI ON CH.VIDEO_ID=VI.VIDEO_ID