struct CommentSource {
	1:string id, 
	2:string link, 
	3:string detail
		
}

struct Cooperation {
	 1:string profile_url, 
	 2:string original_url, 
	 3:string source,
	 4:string icon
}
	
struct LikeInfo {
	 1:i32 optid,
	 2:string text,
	 3:i32 result
}

struct CommentUser {
     1:string uid, 
     2:string username,
     3:string photo, 
     4:string isvip,
     5:Cooperation cooperation
}

struct Vote{
	 1:string _id,
	 2:i64 xid,
	 3:i64 pid,
	 4:i32 cid,
	 5:i64 uid,
	 6:string title,
	 7:string content,
	 8:map<i32, LikeInfo> items,
	 19:string show,
	 10:i32 choice,
	 11:i64 endtime,
	 12:bool isExpire
}	
			


service CommentService {
	bool addComment(1: string value)
}

struct Comment{	
     1:i64 _id,
     2:string commentid, 
     3:string content, 
     4:string vtime, 
     5:string ctime, 
     6:string city, 
     7:i64 replynum, 
     8:string share,
     9:string like,
     10:i64 pid, 
     11:i64 xid,
     12:i32 cid, 
     13:string title,
     14:map<string, string> replys, 
     15:CommentSource source, 
     16:CommentUser user, 
     17:string isLike,
     18:string isVoted,
     19:string flag,
     20:string reply,
     21:string uid,
     22:string ssouid,
     23:Vote vote,
     24:string cmtType,
     25:string img, 
     26:map<string, string> imgPack, 
     27:i64 htime 
}
