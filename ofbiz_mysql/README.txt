docker build -t ofbiz_mysql .
docker run --name ofbiz_mysql -e MYSQL_ROOT_PASSWORD=root -v /data/ofbiz_mysql/datadir:/var/lib/mysql -d ofbiz_mysql
