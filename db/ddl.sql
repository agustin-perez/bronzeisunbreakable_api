/*
	DDL - DB table creation
*/

/* Begin */
	DROP DATABASE IF EXISTS bronzeisunbreakable;
	CREATE DATABASE IF NOT EXISTS bronzeisunbreakable;
	USE bronzeisunbreakable;

/* Table creation */
    CREATE TABLE user (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
		username varchar(32),
        name varchar(64),
        last_name varchar(64),
        discord_pfp_url varchar(255),
        enabled boolean,
		PRIMARY KEY (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    /*CREATE TABLE shadow (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
		idu MEDIUMINT NOT NULL,
		
		PRIMARY KEY (idi, id),
		CONSTRAINT fk_media_changelog_entry FOREIGN KEY (id) REFERENCES changelog_entry (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8; */

	CREATE TABLE changelog_entry (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
		title TEXT,
        body MEDIUMTEXT,
        severity INT,
		PRIMARY KEY (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    /* Can also be a button url */
	CREATE TABLE media_changelog_entry (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
		idc MEDIUMINT NOT NULL,
		url varchar(255),	
		PRIMARY KEY (id, idc),
		CONSTRAINT fk_media_changelog_entry FOREIGN KEY (idc) REFERENCES changelog_entry (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    CREATE TABLE home_entry (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
        maintitle TEXT,
		subtitle TEXT,
        body MEDIUMTEXT,
		PRIMARY KEY (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8;

    CREATE TABLE media_home_entry (
		id MEDIUMINT NOT NULL AUTO_INCREMENT,
		idh MEDIUMINT NOT NULL,
		url varchar(255),	
		PRIMARY KEY (id, idh),
		CONSTRAINT fk_media_home_entry FOREIGN KEY (idh) REFERENCES changelog_entry (id)
	) ENGINE = InnoDB DEFAULT CHARSET = UTF8; 

    /* End table creation */
/* End */