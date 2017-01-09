/****** Script for SelectTopNRows command from SSMS  ******/
SELECT   [PLAYLIST_ID]
      ,[PLAYLIST_NAME]
      ,PL.[VIDEO_ID]
	  ,V.VIDEO_NAME
       
  FROM [Myassignment].[dbo].[Assignment.Playlist] as PL

  Join [Myassignment].[dbo].[Assignment.Video] as V ON PL.VIDEO_ID=V.VIDEO_ID