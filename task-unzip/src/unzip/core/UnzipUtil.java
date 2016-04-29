/**
 *
 */
package unzip.core;

import unzip.core.impl.UnzipUtilImpl;

/**
 * @author sholzer
 *
 */
public abstract class UnzipUtil
{

  private static UnzipUtil instance;

  public static void setInstance(UnzipUtil instance)
  {
    UnzipUtil.instance = instance;
  }

  public static UnzipUtil getInstance()
  {
    if (instance == null)
    {
      instance = new UnzipUtilImpl();
    }
    return instance;
  }

  public abstract void unzip(String zipFile, String destDir);

}
