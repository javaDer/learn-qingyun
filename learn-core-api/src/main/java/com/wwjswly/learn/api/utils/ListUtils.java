package com.wwjswly.learn.api.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ListUtils {
    /**
     * 单个对象转换
     */
    public static <T> List<T> copyList(List<?> doList, Class<T> voClass) {
        List<T> voList = new ArrayList<>();
        try {
            T voObj = null;
            for (Object doObj : doList) {
                voObj = voClass.newInstance();
                BeanUtils.copyProperties(doObj, voObj);
                voList.add(voObj);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return voList;
    }
}
