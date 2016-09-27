package com.rxjava;

import java.util.Arrays;
import java.util.List;

import rx.*;
import rx.functions.*;

public class Poc1 {

    public void printList() {
        List<String> list = Arrays.asList("Android", "Ubuntu", "Mac OS");
        Observable<List<String>> listObservable = Observable.just(list);
        listObservable.subscribe(new Observer<List<String>>() {

            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onNext(List<String> list) {
                System.out.println(list);
            }
        });
    }

    public List<String> filter(final String lookupString, final String... values) {
        List<String> filteredValues = Arrays.asList();
        Observable.from(values).filter(new Func1<String, Boolean>() {
            @Override
            public Boolean call(String s) {
                return s.contains(lookupString);
            }
        });
        return filteredValues;
    }


}
