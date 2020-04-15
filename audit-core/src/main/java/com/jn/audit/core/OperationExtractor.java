package com.jn.audit.core;

import com.jn.audit.core.model.Operation;
import com.jn.audit.core.operation.OperationDefinitionRepository;
import com.jn.langx.util.function.Supplier;

public interface OperationExtractor<AuditedRequest,AuditedRequestContext> extends Supplier<AuditRequest<AuditedRequest,AuditedRequestContext>, Operation> {
    String extractOperationName(AuditRequest<AuditedRequest,AuditedRequestContext> wrappedRequest);
    void setOperationDefinitionRepository(OperationDefinitionRepository repository);
}
