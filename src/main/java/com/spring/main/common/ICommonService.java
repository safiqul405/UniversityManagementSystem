
package com.spring.main.common;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface ICommonService <T> {
    public T save(HttpServletRequest request);
    public T update(HttpServletRequest request);
    public T edit(String id);
    public boolean delete(String id);
    public List<T> getAll();
}
