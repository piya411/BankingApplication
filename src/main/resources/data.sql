CREATE TABLE Account (
  acc_no  VARCHAR(64)NOT NULL PRIMARY KEY,
  acc_name VARCHAR(64) NOT NULL,
  acc_type  VARCHAR(64) NOT NULL,
  bal_date DATE NOT NULL,
  currency VARCHAR(64) NOT NULL,
  avail_bal DECIMAL(10,2) );

insert into Account values('791066619','AUSavings933','Savings','2018-11-08','AUD',88005.93);
insert into Account values('585309209','SGSavings726','Savings','2018-11-08','SGD',84327.51);
insert into Account values('321143048','AUCurrent433','Current','2018-11-08','AUD',38010.62);
insert into Account values('347786244','SGCurrent166','Current','2018-11-08','SGD',50664.65);
insert into Account values('680168913','AUCurrent374','Current','2018-11-08','AUD',41327.28);
insert into Account values('136056165','AUSavings938','Savings','2018-11-08','AUD',48928.79);
insert into Account values('453963528','SGSavings842','Savings','2018-11-08','SGD',72117.53);
insert into Account values('334666982','AUSavings253','Savings','2018-11-08','AUD',20588.16);
insert into Account values('793949180','AUCurrent754','Current','2018-11-08','AUD',88794.48);
insert into Account values('768759901','SGCurrent294','Current','2018-11-08','AUD',5906.55);
insert into Account values('847257972','AUCurrent591','Current','2018-11-08','AUD',92561.68);

CREATE TABLE Transactions (
  transaction_id VARCHAR(64) NOT NULL PRIMARY KEY,
  acc_no VARCHAR(64) NOT NULL ,
  acc_name VARCHAR(64) NOT NULL,
  transaction_type  VARCHAR(64) NOT NULL,
  value_date DATE,
  currency VARCHAR(64) NOT NULL,
  debit_amount DECIMAL(10,2),
  credit_amount DECIMAL(10,2),
  transaction_narrative VARCHAR(64) NOT NULL
  );



insert into Transactions values('1','791066619','Savings','Debit','2019-11-11','AUD',113.88,NULL,'');
insert into Transactions values('2','768759901','Savings','Credit','2015-11-11','AUD',NULL,2345.88,'');
insert into Transactions values('3','585309209','Savings','Credit','2018-1-11','AUD',NULL,5000,'');
insert into Transactions values('4','768759901','Current','Debit','2019-11-11','AUD',5000,NULL,'');
insert into Transactions values('5','847257972','Current','Debit','20197-11-11','SGD',5000,NULL,'');
insert into Transactions values('6','768759901','Current','Credit','2019-2-8','AUD',NULL,3422.90,'');
insert into Transactions values('7','585309209','Savings','Credit','2019-6-11','AUD',5000,0,'');
insert into Transactions values('8','768759901','Savings','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('9','847257972','Current','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('10','793949180','Current','Debit','2019-4-5','SGD',5000,0,'');
insert into Transactions values('11','768759901','Savings','Credit','2019-11-11','AUD',NULL,88.55,'');
insert into Transactions values('12','321143048','Current','Debit','2019-11-1','AUD',5000,0,'');
insert into Transactions values('13','791066619','Savings','Debit','2018-11-11','AUD',5000,0,'');
insert into Transactions values('14','680168913','Current','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('15','768759901','Savings','Credit','2017-1-11','AUD',NULL,7890.55,'');
insert into Transactions values('16','136056165','Savings','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('17','768759901','Current','Credit','2019-11-1','SGD',NULL,234.67,'');
insert into Transactions values('18','136056165','Savings','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('19','768759901','Savings','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('20','680168913','Current','Debit','2016-4-7','AUD',5000,0,'');
insert into Transactions values('21','347786244','Savings','Credit','2019-11-11','AUD',NULL,11221,'');
insert into Transactions values('22','453963528','Savings','Debit','2019-11-9','AUD',5000,0,'');
insert into Transactions values('23','680168913','Current','Credit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('24','453963528','Savings','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('25','334666982','Savings','Credit','2019-11-11','AUD',NULL,4322,'');
insert into Transactions values('26','334666982','Current','Debit','2019-11-11','AUD',5000,0,'');
insert into Transactions values('27','847257972','Savings','Credit','2019-11-11','AUD',NULL,2342,'');
insert into Transactions values('28','847257972','Current','Debit','2019-11-11','SGD',5000,0,'');





