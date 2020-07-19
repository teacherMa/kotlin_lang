package test;

import advance.concurrent.LockAndUnLock;

public class JavaInterActive {
    public static void main(String[] args) {
        new LockAndUnLock().startACoroutines();
        new LockAndUnLock().blockedBlock();
    }
}
