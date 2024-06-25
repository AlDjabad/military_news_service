delete from RSS_SOURCE where 1=1;
INSERT INTO RSS_SOURCE (source_name, description, last_updates, rss_url)
VALUES ('defensenews', 'www.defensenews.com rss source', now(), 'https://www.defensenews.com/arc/outboundfeeds/rss/category/global/?outputType=xml');