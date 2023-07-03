package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextboxAlignMiddle24: ImageVector
  get() {
    if (_textboxAlignMiddle24 != null) {
      return _textboxAlignMiddle24!!
    }
    _textboxAlignMiddle24 = fluentIcon(name = "Regular.TextboxAlignMiddle24", 24f) {
      materialPath {
          moveTo(7.0F, 10.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.336F, 1.0F, 0.75F)
          curveToRelative(0.0F, 0.38F, -0.376F, 0.694F, -0.864F, 0.743F)
          lineTo(17.0F, 11.5F)
          horizontalLineTo(7.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.336F, -1.0F, -0.75F)
          curveToRelative(0.0F, -0.38F, 0.376F, -0.694F, 0.864F, -0.743F)
          lineTo(7.0F, 10.0F)
          close()
          moveToRelative(10.0F, 3.0F)
          horizontalLineTo(7.0F)
          lineToRelative(-0.136F, 0.007F)
          curveTo(6.376F, 13.057F, 6.0F, 13.37F, 6.0F, 13.75F)
          curveToRelative(0.0F, 0.414F, 0.448F, 0.75F, 1.0F, 0.75F)
          horizontalLineToRelative(10.0F)
          lineToRelative(0.136F, -0.007F)
          curveTo(17.624F, 14.443F, 18.0F, 14.13F, 18.0F, 13.75F)
          curveToRelative(0.0F, -0.414F, -0.448F, -0.75F, -1.0F, -0.75F)
          close()
          moveToRelative(4.0F, -7.25F)
          curveTo(21.0F, 4.231F, 19.769F, 3.0F, 18.25F, 3.0F)
          horizontalLineTo(5.75F)
          curveTo(4.231F, 3.0F, 3.0F, 4.231F, 3.0F, 5.75F)
          verticalLineToRelative(12.5F)
          curveTo(3.0F, 19.769F, 4.231F, 21.0F, 5.75F, 21.0F)
          horizontalLineToRelative(12.5F)
          curveToRelative(1.519F, 0.0F, 2.75F, -1.231F, 2.75F, -2.75F)
          verticalLineTo(5.75F)
          close()
          moveTo(5.75F, 4.5F)
          horizontalLineToRelative(12.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, 0.56F, 1.25F, 1.25F)
          verticalLineToRelative(12.5F)
          curveToRelative(0.0F, 0.69F, -0.56F, 1.25F, -1.25F, 1.25F)
          horizontalLineTo(5.75F)
          curveToRelative(-0.69F, 0.0F, -1.25F, -0.56F, -1.25F, -1.25F)
          verticalLineTo(5.75F)
          curveToRelative(0.0F, -0.69F, 0.56F, -1.25F, 1.25F, -1.25F)
          close()        
      }
    }
    return _textboxAlignMiddle24!!
  }

private var _textboxAlignMiddle24: ImageVector? = null