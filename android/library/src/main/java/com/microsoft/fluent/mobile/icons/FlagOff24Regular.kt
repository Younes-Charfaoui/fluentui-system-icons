package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.FlagOff24: ImageVector
  get() {
    if (_flagOff24 != null) {
      return _flagOff24!!
    }
    _flagOff24 = fluentIcon(name = "Regular.FlagOff24", 24f) {
      materialPath {
          moveTo(2.5F, 2.5F)
          lineToRelative(18.0F, 18.0F)
          curveToRelative(0.293F, 0.294F, 0.293F, 0.769F, 0.0F, 1.062F)
          curveToRelative(-0.293F, 0.293F, -0.768F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-5.063F, -5.063F)
          lineTo(4.5F, 16.501F)
          verticalLineToRelative(4.75F)
          curveToRelative(0.0F, 0.379F, -0.282F, 0.693F, -0.648F, 0.742F)
          lineTo(3.75F, 22.0F)
          curveToRelative(-0.38F, 0.0F, -0.693F, -0.282F, -0.743F, -0.648F)
          lineTo(3.0F, 21.25F)
          verticalLineTo(5.122F)
          lineToRelative(-1.56F, -1.56F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.768F, 0.0F, -1.061F)
          curveToRelative(0.292F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          close()
          moveToRelative(2.617F, 0.498F)
          horizontalLineToRelative(15.137F)
          curveToRelative(0.618F, 0.0F, 0.971F, 0.706F, 0.6F, 1.2F)
          lineTo(16.69F, 9.75F)
          lineToRelative(4.164F, 5.55F)
          curveToRelative(0.371F, 0.495F, 0.018F, 1.2F, -0.6F, 1.2F)
          horizontalLineTo(18.62F)
          lineToRelative(-1.5F, -1.5F)
          horizontalLineToRelative(1.634F)
          lineToRelative(-3.602F, -4.8F)
          curveToRelative(-0.2F, -0.267F, -0.2F, -0.634F, 0.0F, -0.9F)
          lineToRelative(3.602F, -4.802F)
          horizontalLineTo(6.617F)
          lineToRelative(-1.5F, -1.5F)
          close()
          moveTo(4.5F, 6.622F)
          verticalLineToRelative(8.379F)
          lineToRelative(8.377F, -0.002F)
          lineTo(4.5F, 6.622F)
          close()        
      }
    }
    return _flagOff24!!
  }

private var _flagOff24: ImageVector? = null
