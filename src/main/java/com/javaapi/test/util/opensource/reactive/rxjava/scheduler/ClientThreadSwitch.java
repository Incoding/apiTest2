package com.javaapi.test.util.opensource.reactive.rxjava.scheduler;

/**
 *
 * https://segmentfault.com/a/1190000004856071
 * subscribeOn的调用切换之前的线程。

 observeOn的调用切换之后的线程。

 observeOn之后，不可再调用subscribeOn 切换线程




其他解释 :

 下面提到的“操作”包括产生事件、用操作符操作事件以及最终的通过 subscriber 消费事件

 只有第一subscribeOn() 起作用（所以多个 subscribeOn() 毛意义）

 这个 subscribeOn() 控制从流程开始的第一个操作，直到遇到第一个 observeOn()

 observeOn() 可以使用多次，每个 observeOn() 将导致一次线程切换()，这次切换开始于这次 observeOn() 的下一个操作

 不论是 subscribeOn() 还是 observeOn()，每次线程切换如果不受到下一个 observeOn() 的干预，线程将不再改变，不会自动切换到其他线程
 */
public class ClientThreadSwitch {
}
