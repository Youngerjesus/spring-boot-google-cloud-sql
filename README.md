# spring-boot-google-cloud-sql 
***

## Usage

#### 1. Cloud SQL 인증 프록시를 다운로드합니다.

````
$ curl -o cloud_sql_proxy https://dl.google.com/cloudsql/cloud_sql_proxy.darwin.amd64
````

#### 2. Cloud SQL 인증 프록시 실행 파일을 만듭니다.

````
$ chmod +x cloud_sql_proxy
````

#### 3. Cloud SQL 인증 프록시 시작

```
$ ./cloud_sql_proxy -instances=INSTANCE_CONNECTION_NAME=tcp:0.0.0.0:1234

or

$ ./cloud_sql_proxy -instances=INSTANCE_CONNECTION_NAM=tcp:3306 \
                    -credential_file=PATH_TO_KEY_FILE &

// MyCase
 
$ ./cloud_sql_proxy -instances=mdag-community:asia-northeast3:coniverse-dev=tcp:127.0.0.1:3306 &
```

***
### Cloud SQL 인증 프록시를 사용하여 연결

https://cloud.google.com/sql/docs/mysql/connect-admin-proxy?hl=ko#macos-32-bit

### Cloud SQL 인증 프록시 정보

https://cloud.google.com/sql/docs/mysql/sql-proxy?hl=ko

### Recipe: CloudSQL Backup + Migration Using GitHub Actions

https://haha.world/recipe-gh-action-cloud-sql/
