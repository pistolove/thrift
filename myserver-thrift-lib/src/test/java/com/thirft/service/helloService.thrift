

struct User{
    1:i32 id,
    2:string name,
    3:i32 timestamp,
    4:bool vip
}

service UserService {
    User getById(1:i32 id)
}