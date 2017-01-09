 

Select * from (


Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel]
group BY CHANNEL_ID
Order by Count(VIDEO_ID) desc
 

) MaxCnt
UNION ALL

Select * from(Select  Top 1 CHANNEL_ID,Count(VIDEO_ID) cnt  FROM [Myassignment].[dbo].[Assignment.Channel]

group BY CHANNEL_ID
Order by Count(VIDEO_ID)
)b