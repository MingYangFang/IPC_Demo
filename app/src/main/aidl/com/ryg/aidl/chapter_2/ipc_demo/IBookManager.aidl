// IBookManager.aidl
package com.ryg.aidl.chapter_2.ipc_demo;

// Declare any non-default types here with import statements
import com.ryg.aidl.chapter_2.ipc_demo.Book;
interface IBookManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
    List<Book>  getBookList();

    void addBook(in Book  nook);
}
