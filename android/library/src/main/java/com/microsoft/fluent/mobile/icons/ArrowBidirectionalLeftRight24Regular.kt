package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowBidirectionalLeftRight24: ImageVector
  get() {
    if (_arrowBidirectionalLeftRight24 != null) {
      return _arrowBidirectionalLeftRight24!!
    }
    _arrowBidirectionalLeftRight24 = fluentIcon(name = "Regular.ArrowBidirectionalLeftRight24", 24f) {
      materialPath {
          moveTo(9.03F, 6.47F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineTo(5.56F, 11.0F)
          horizontalLineToRelative(12.88F)
          lineToRelative(-3.47F, -3.47F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          lineToRelative(4.75F, 4.75F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(-4.75F, 4.75F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(3.47F, -3.47F)
          horizontalLineTo(5.56F)
          lineToRelative(3.47F, 3.47F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          lineToRelative(-4.75F, -4.75F)
          curveToRelative(-0.293F, -0.293F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(4.75F, -4.75F)
          curveToRelative(0.293F, -0.293F, 0.767F, -0.293F, 1.06F, 0.0F)
          close()        
      }
    }
    return _arrowBidirectionalLeftRight24!!
  }

private var _arrowBidirectionalLeftRight24: ImageVector? = null
