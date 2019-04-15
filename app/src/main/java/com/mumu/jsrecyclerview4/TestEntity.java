package com.mumu.jsrecyclerview4;


import java.io.Serializable;
import java.util.List;

/**
 * @author : zlf
 * date    : 2019/4/15
 * github  : https://github.com/mamumu
 * blog    : https://www.jianshu.com/u/281e9668a5a6
 */
public class TestEntity implements Serializable {

//    {
//        "Result":[
//        {
//            "list":[
//            {
//                "message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"
//            },
//            {
//                "message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"
//            }
//            ],
//            "title":"我有一只小狗"
//        },
//        {
//            "list":[
//            {
//                "message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"
//            }
//            ],
//            "title":"我有一只小狗"
//        }
//    ],
//        "Success":true,
//            "StatusCode":200
//    }

    /**
     * Result : [{"list":[{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"},{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}],"title":"我有一只小狗"},{"list":[{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}],"title":"我有一只小狗"}]
     * Success : true
     * StatusCode : 200
     */

    private boolean Success;
    private int StatusCode;
    private List<ResultBean> Result;

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int StatusCode) {
        this.StatusCode = StatusCode;
    }

    public List<ResultBean> getResult() {
        return Result;
    }

    public void setResult(List<ResultBean> Result) {
        this.Result = Result;
    }

    public static class ResultBean {
        /**
         * list : [{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"},{"message":"我有一只小狗我有一只小狗我有一只小狗我有一只小狗"}]
         * title : 我有一只小狗
         */

        private String title;
        private List<ListBean> list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * message : 我有一只小狗我有一只小狗我有一只小狗我有一只小狗
             */

            private String message;

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }
    }
}
