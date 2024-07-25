FROM python

RUN pip install fastapi uvicorn

COPY first-app.py first-app.py

EXPOSE 9080

CMD ["uvicorn", "first-app:app", "--host", "0.0.0.0", "--port", "9080"]