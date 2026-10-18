package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j<TResult> {
    public j<TResult> addOnCanceledListener(Activity activity, d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public j<TResult> addOnCompleteListener(Activity activity, e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract j<TResult> addOnFailureListener(Activity activity, f fVar);

    public abstract j<TResult> addOnFailureListener(f fVar);

    public abstract j<TResult> addOnFailureListener(Executor executor, f fVar);

    public abstract j<TResult> addOnSuccessListener(Activity activity, g<? super TResult> gVar);

    public abstract j<TResult> addOnSuccessListener(g<? super TResult> gVar);

    public abstract j<TResult> addOnSuccessListener(Executor executor, g<? super TResult> gVar);

    public <TContinuationResult> j<TContinuationResult> continueWith(c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> continueWithTask(c<TResult, j<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(Class<X> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> j<TContinuationResult> onSuccessTask(i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public j<TResult> addOnCanceledListener(d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public j<TResult> addOnCompleteListener(e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> continueWith(Executor executor, c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> continueWithTask(Executor executor, c<TResult, j<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> j<TContinuationResult> onSuccessTask(Executor executor, i<TResult, TContinuationResult> iVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public j<TResult> addOnCanceledListener(Executor executor, d dVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public j<TResult> addOnCompleteListener(Executor executor, e<TResult> eVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
