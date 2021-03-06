/*
 * Copyright © 2022 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.jarabica.lwjgl.internal.efx;

import com.io7m.jarabica.api.JAException;
import com.io7m.jarabica.api.JAExtensionType;
import com.io7m.jarabica.extensions.efx.JAEFXType;
import com.io7m.jarabica.lwjgl.internal.JALContext;
import com.io7m.jarabica.lwjgl.internal.JALExtensionFactoryType;

/**
 * The EFX extension.
 */

public final class JALExtensionEFX implements JALExtensionFactoryType
{
  /**
   * The EFX extension.
   */

  public JALExtensionEFX()
  {

  }

  @Override
  public Class<? extends JAExtensionType> extensionClass()
  {
    return JAEFXType.class;
  }

  @Override
  public String name()
  {
    return JAEFXType.NAME;
  }

  @Override
  public JAExtensionType create(
    final JALContext context)
    throws JAException
  {
    context.check();

    return new JALExtensionEFXContext(
      context,
      context.errorChecker()
    );
  }
}
