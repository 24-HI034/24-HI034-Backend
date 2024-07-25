from fastapi import FastAPI
app = FastAPI()

# 기본 경로
@app.get("/second")
def read_root():
    return {"Hello": "World"}

# 경로 매개변수
@app.get("/second/ttt")
def read_item():
    return "test1"

# POST 요청 처리
@app.get("/second/tt")
def create_item():
    return "test2"


