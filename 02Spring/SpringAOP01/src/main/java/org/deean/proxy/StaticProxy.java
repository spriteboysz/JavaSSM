package org.deean.proxy;

import org.deean.dao.GeneralDAO;

/**
 * Author: Deean
 * Date: 2023-11-11 19:31
 * FileName: src/main/java/org/deean/proxy
 * Description:
 */

public class StaticProxy {

    GeneralDAO generalDAO;

    public StaticProxy(GeneralDAO generalDAO) {
        this.generalDAO = generalDAO;
    }

    public void insert() {
        begin();
        generalDAO.insert();
        commit();
    }

    public void delete() {
        begin();
        generalDAO.delete();
        commit();
    }

    public void update() {
        begin();
        generalDAO.update();
        commit();
    }

    public void begin() {
        System.out.println("---开启事务---");
    }

    public void commit() {
        System.out.println("---提交事务---");
    }
}
