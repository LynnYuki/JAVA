package PCTest.ManyToMany;

//������
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				//�޸�wait����
				while (!ValueObject.value.equals("")) {
					System.out.println("������"
							+ Thread.currentThread().getName() + " WAITING**");
					lock.wait();
				}
				System.out.println("������" + Thread.currentThread().getName()
						+ " RUNNABLE%%");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
