## Description

A Leiningen plugin that renders meaningful search results.

## Install

Add `[lein-grep "0.1.0"]` to your ~/.lein/profiles.clj:

    {:user {:plugins [[lein-grep "0.1.0"]]}}

## Usage

Which do you prefer when searching? A well formatted table with one line per result:

```sh
$ lein grep table
Searching over Artifact ID...
+-------------------------------------------+-------------------------+------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| artifact                                  | group                   | version    | desc                                                                                                                                                             |
+-------------------------------------------+-------------------------+------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| TableLayout                               | tablelayout             | 20050920   | TableLayout is a totally free layout manager designed to make\n        creating user interfaces fast and easy. It can do anything\n        GridBagLayout can ... |
| TableLayoutPersistenceDelegate            | tablelayout             | 20020517   |                                                                                                                                                                  |
| clj-table                                 | clj-table               | 0.1.5      | a SQL ORM for clojure                                                                                                                                            |
| column-table-model                        | hu.kazocsaba            | 1.0.0      | A column-wise defined table model.                                                                                                                               |
| de.huxhorn.sulky.buffers.table            | de.huxhorn.sulky        | 0.9.15     | This file is part of the sulky modules. It contains a TableModel using Buffer as backend.                                                                        |
| metridoc-table-plugin                     | com.googlecode.metridoc | 0.30       | Provides basic functionality to provide a datasource for the metridoc toolkit                                                                                    |
| org.connid.bundles.db.table               | org.connid.bundles.db   | 2.1.4      |                                                                                                                                                                  |
| org.openl.rules.tableeditor               | org.openl.rules         | 5.9.4.1    | TableEditor JSF Component                                                                                                                                        |
| org.openxma.addons.ui.table               | org.codehaus.openxma    | 5.0.8      |                                                                                                                                                                  |
| org.openxma.addons.ui.tablecombo          | org.codehaus.openxma    | 5.0.8      |                                                                                                                                                                  |
| sirocco-text-table-formatter              | org.ow2.sirocco         | 1.0        |                                                                                                                                                                  |
| t1ck-widebase-db-table-mbt_2.9.1          | org.bitbucket.t1ck      | 0.1.0      | t1ck-widebase-db-table-mbt                                                                                                                                       |
| t1ck-widebase-db-table-swfx_2.9.1         | org.bitbucket.t1ck      | 0.1.0      | t1ck-widebase-db-table-swfx                                                                                                                                      |
| t1ck-widebase-db-table_2.9.1              | org.bitbucket.t1ck      | 0.1.0      | t1ck-widebase-db-table                                                                                                                                           |
| table                                     | org.clojars.cldwalker   | 0.1.1      | Display ascii tables for almost any data structure with ease                                                                                                     |
| table                                     | table                   | 0.3.2      | Display ascii tables for almost any data structure with ease                                                                                                     |
| table-data-copier                         | com.googlecode.usc      | 0.4        | copy table's data from one database to another database(same table schema)                                                                                       |
| table-data-copier                         | com.github.usc          | 0.2        | copy table's data from one database to another database(same table schema)                                                                                       |
| tablefilter-swing                         | net.coderazzi           | 4.5.0      | TableFilter is a set of Swing components to support user-driven filtering on table.                                                                              |
| tablefilter-swing-java5                   | net.coderazzi           | 4.5.0      | TableFilter is a set of Swing components to support user-driven filtering on table.\nThis project corresponds to the Java5 version                               |
| tableformatter                            | tableformatter          | 0.96.2     | iNamik TableFormatter is a simple set of Java classes to help print text in tabulated form.                                                                      |
| tablelayout                               | org.clojars.taweili     | 2009.08.26 |                                                                                                                                                                  |
| utils-apl-derived-table                   | org.omnaest.utils       | 0.2.7      |                                                                                                                                                                  |
| utils-apl-derived-table-orientdbconnector | org.omnaest.utils       | 0.2.7      |                                                                                                                                                                  |
| widebase-db-table_2.9.1                   | com.github.widebase     | 0.1.1      | widebase-db-table                                                                                                                                                |
| widebase-db-table_2.9.2                   | com.github.widebase     | 0.1.3      | widebase-db-table                                                                                                                                                |
| widebase-io-table_2.9.1                   | com.github.widebase     | 0.1.1      | widebase-io-table                                                                                                                                                |
| widebase-io-table_2.9.2                   | com.github.widebase     | 0.1.3      | widebase-io-table                                                                                                                                                |
| widebase-rpc-table_2.9.1                  | com.github.widebase     | 0.1.0      | widebase-rpc-table                                                                                                                                               |
+-------------------------------------------+-------------------------+------------+------------------------------------------------------------------------------------------------------------------------------------------------------------------+
Count: 29
Page: 1/1
```

Or the default search?

```sh
$ lein search table
Searching over Artifact ID...
 == Showing page 1 / 9
[tablelayout/TableLayoutPersistenceDelegate "20020517"]
[tablelayout/TableLayout "20050920"] TableLayout is a totally free layout manager designed to make
        creating user interfaces fast and easy. It can do anything
        GridBagLayout can do and much, much more. Yet it is remarkably
        simple and easy to use.
[tablelayout/TableLayout "20050920" :classifier "sources"] TableLayout is a totally free layout manager designed to make
        creating user interfaces fast and easy. It can do anything
        GridBagLayout can do and much, much more. Yet it is remarkably
        simple and easy to use.
[tablelayout/TableLayout "20050920" :classifier "javadoc"] TableLayout is a totally free layout manager designed to make
        creating user interfaces fast and easy. It can do anything
        GridBagLayout can do and much, much more. Yet it is remarkably
        simple and easy to use.
[tablelayout/TableLayout "20020517"]
[org.openl.rules/org.openl.rules.tableeditor "5.8.0"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.8.0" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.8.0" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.5"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.5" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.5" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.4"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.4" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.4" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.3"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.3" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.3" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.2"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.2" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.2" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.2"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.2" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.2" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.1"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.1" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1.1" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.1" :classifier "javadoc"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.0"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.0" :classifier "sources"] TableEditor JSF Component
[org.openl.rules/org.openl.rules.tableeditor "5.7.0" :classifier "javadoc"] TableEditor JSF Component
[org.connid.bundles.db/org.connid.bundles.db.table "1.2.1"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.2.1" :classifier "sources"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.2.1" :classifier "javadoc"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.2"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.2" :classifier "sources"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.2" :classifier "javadoc"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.1"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.1" :classifier "sources"]
[org.connid.bundles.db/org.connid.bundles.db.table "1.1" :classifier "javadoc"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.2" :packaging "war"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.2" :classifier "sources"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.2" :classifier "facade"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.1" :packaging "war"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.1" :classifier "sources"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.1" :classifier "facade"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.0" :packaging "war"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.0" :classifier "sources"]
[org.codehaus.openxma/org.openxma.addons.ui.table "4.0.0" :classifier "facade"]
```

## TODO
* Collapse forks by default using artifact name
* Consider adding more attributes from ArtifactInfo results
* Option parsing for multiple options
