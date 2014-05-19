// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Bank.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Bank;

public final class PremiumAccountPrxHelper extends Ice.ObjectPrxHelperBase implements PremiumAccountPrx
{
    private static final String __getAccountNumber_name = "getAccountNumber";

    public String getAccountNumber()
    {
        return getAccountNumber(null, false);
    }

    public String getAccountNumber(java.util.Map<String, String> __ctx)
    {
        return getAccountNumber(__ctx, true);
    }

    private String getAccountNumber(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getAccountNumber", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getAccountNumber");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getAccountNumber(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getAccountNumber()
    {
        return begin_getAccountNumber(null, false, null);
    }

    public Ice.AsyncResult begin_getAccountNumber(java.util.Map<String, String> __ctx)
    {
        return begin_getAccountNumber(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getAccountNumber(Ice.Callback __cb)
    {
        return begin_getAccountNumber(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccountNumber(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getAccountNumber(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getAccountNumber(Callback_Account_getAccountNumber __cb)
    {
        return begin_getAccountNumber(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccountNumber(java.util.Map<String, String> __ctx, Callback_Account_getAccountNumber __cb)
    {
        return begin_getAccountNumber(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getAccountNumber(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getAccountNumber_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getAccountNumber_name, __cb);
        try
        {
            __result.__prepare(__getAccountNumber_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_getAccountNumber(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getAccountNumber_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getBalance_name = "getBalance";

    public int getBalance()
    {
        return getBalance(null, false);
    }

    public int getBalance(java.util.Map<String, String> __ctx)
    {
        return getBalance(__ctx, true);
    }

    private int getBalance(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getBalance", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getBalance");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getBalance(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getBalance()
    {
        return begin_getBalance(null, false, null);
    }

    public Ice.AsyncResult begin_getBalance(java.util.Map<String, String> __ctx)
    {
        return begin_getBalance(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getBalance(Ice.Callback __cb)
    {
        return begin_getBalance(null, false, __cb);
    }

    public Ice.AsyncResult begin_getBalance(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getBalance(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getBalance(Callback_Account_getBalance __cb)
    {
        return begin_getBalance(null, false, __cb);
    }

    public Ice.AsyncResult begin_getBalance(java.util.Map<String, String> __ctx, Callback_Account_getBalance __cb)
    {
        return begin_getBalance(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getBalance(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getBalance_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getBalance_name, __cb);
        try
        {
            __result.__prepare(__getBalance_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_getBalance(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getBalance_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __transfer_name = "transfer";

    public void transfer(String accountNumber, int amount)
        throws IncorrectAccountNumber,
               IncorrectAmount
    {
        transfer(accountNumber, amount, null, false);
    }

    public void transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx)
        throws IncorrectAccountNumber,
               IncorrectAmount
    {
        transfer(accountNumber, amount, __ctx, true);
    }

    private void transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws IncorrectAccountNumber,
               IncorrectAmount
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "transfer", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("transfer");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    __del.transfer(accountNumber, amount, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount)
    {
        return begin_transfer(accountNumber, amount, null, false, null);
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx)
    {
        return begin_transfer(accountNumber, amount, __ctx, true, null);
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount, Ice.Callback __cb)
    {
        return begin_transfer(accountNumber, amount, null, false, __cb);
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_transfer(accountNumber, amount, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount, Callback_Account_transfer __cb)
    {
        return begin_transfer(accountNumber, amount, null, false, __cb);
    }

    public Ice.AsyncResult begin_transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx, Callback_Account_transfer __cb)
    {
        return begin_transfer(accountNumber, amount, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_transfer(String accountNumber, int amount, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__transfer_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __transfer_name, __cb);
        try
        {
            __result.__prepare(__transfer_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(accountNumber);
            __os.writeInt(amount);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_transfer(Ice.AsyncResult __result)
        throws IncorrectAccountNumber,
               IncorrectAmount
    {
        Ice.AsyncResult.__check(__result, this, __transfer_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(IncorrectAccountNumber __ex)
                {
                    throw __ex;
                }
                catch(IncorrectAmount __ex)
                {
                    throw __ex;
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            __result.__readEmptyParams();
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __calculateLoan_name = "calculateLoan";

    public void calculateLoan(int amount, currency curr, int period, Ice.IntHolder totalCost, Ice.FloatHolder interestRate)
        throws IncorrectData
    {
        calculateLoan(amount, curr, period, totalCost, interestRate, null, false);
    }

    public void calculateLoan(int amount, currency curr, int period, Ice.IntHolder totalCost, Ice.FloatHolder interestRate, java.util.Map<String, String> __ctx)
        throws IncorrectData
    {
        calculateLoan(amount, curr, period, totalCost, interestRate, __ctx, true);
    }

    private void calculateLoan(int amount, currency curr, int period, Ice.IntHolder totalCost, Ice.FloatHolder interestRate, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws IncorrectData
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "calculateLoan", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("calculateLoan");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    __del.calculateLoan(amount, curr, period, totalCost, interestRate, __ctx, __observer);
                    return;
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period)
    {
        return begin_calculateLoan(amount, curr, period, null, false, null);
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, java.util.Map<String, String> __ctx)
    {
        return begin_calculateLoan(amount, curr, period, __ctx, true, null);
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, Ice.Callback __cb)
    {
        return begin_calculateLoan(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_calculateLoan(amount, curr, period, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, Callback_PremiumAccount_calculateLoan __cb)
    {
        return begin_calculateLoan(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, java.util.Map<String, String> __ctx, Callback_PremiumAccount_calculateLoan __cb)
    {
        return begin_calculateLoan(amount, curr, period, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_calculateLoan(int amount, currency curr, int period, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__calculateLoan_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __calculateLoan_name, __cb);
        try
        {
            __result.__prepare(__calculateLoan_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(amount);
            curr.__write(__os);
            __os.writeInt(period);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_calculateLoan(Ice.IntHolder totalCost, Ice.FloatHolder interestRate, Ice.AsyncResult __result)
        throws IncorrectData
    {
        Ice.AsyncResult.__check(__result, this, __calculateLoan_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(IncorrectData __ex)
                {
                    throw __ex;
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            totalCost.value = __is.readInt();
            interestRate.value = __is.readFloat();
            __result.__endReadParams();
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PremiumAccountPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PremiumAccountPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Bank::Account",
        "::Bank::PremiumAccount",
        "::Ice::Object"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PremiumAccountDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PremiumAccountDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PremiumAccountPrx v)
    {
        __os.writeProxy(v);
    }

    public static PremiumAccountPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PremiumAccountPrxHelper result = new PremiumAccountPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
