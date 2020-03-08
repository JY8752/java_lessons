
public abstract class AbstractItem {
	protected String name;
	
	public AbstractItem(String name) {
		this.name = name;
	}
	//抽象メソッド。子クラスで実装。
	public abstract void print(String parentPath);

}

//FiliItemクラス
public class FileItem extends AbstractItem {
	
	public FileItem(String name) {
		super(name);
	}
	
	@Override
	public void print(String parentPath) {
		System.out.println(parentPath + File.separator + name);
	}
}
