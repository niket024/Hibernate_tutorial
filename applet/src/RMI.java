public interface RMI extends java.rmi.Remote
{
	public double amt(double a,double b,double c,double d,double e)throws java.rmi.RemoteException;
}

class RMIimpl extends java.rmi.server.UnicastRemoteObject implements RMI
{
	public RMIimpl() throws java.rmi.RemoteException
	{
		super();
	}
	public double amt(double a,double b,double c,double d,double e)throws java.rmi.RemoteException
	{
		return a+b+c+d+e;
	}
}

