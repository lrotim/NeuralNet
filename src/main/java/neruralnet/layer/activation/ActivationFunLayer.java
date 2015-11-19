package neruralnet.layer.activation;

import neruralnet.function.activation.ActivationFun;
import neruralnet.layer.Layer;

public class ActivationFunLayer implements Layer {

	private ActivationFun fun;
	private int n;
	
	public ActivationFunLayer(ActivationFun fun, int n) {
		super();
		this.fun = fun;
		this.n = n;
	}

	@Override
	public void setWeigths(double[] weights, int offset) {
		//nothing to do here
	}

	@Override
	public void apply(double[] inputs, double[] outputs) {
		assert(inputs.length == n && outputs.length == n);
		for(int i = 0; i < n; i++){
			outputs[i] = fun.apply(inputs[i]);
		}
	}

	@Override
	public double[] getWeights() {
		return null;
	}

	@Override
	public int getNumberOfInputs() {
		return n;
	}

	@Override
	public int getNumberOfOutputs() {
		return n;
	}

	@Override
	public int getNumberOfWeights() {
		return 0;
	}

}