package com.founderbn.springcloud.service;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: microservicecloud
 * @description: service返回结果集（List集合）
 * @author: YangMing
 * @create: 2018-06-16 22:55
 **/
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ServiceMutlResult<T> {
    private long total;

    private List<T> result;

    public ServiceMutlResult(long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {

        this.result = result;
    }

    public int getResultSize() {
        if (this.result == null) {
            return 0;
        }
        return result.size();
    }

}
