create sequence SEQ_RSS_SOURCE;

create table RSS_SOURCE (
    ID NUMERIC not null primary key default nextval('SEQ_RSS_SOURCE'),
    Source_Name text,
    Description text,
    Last_Updates date ,
    Rss_Url text
);
