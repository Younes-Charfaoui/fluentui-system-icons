package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Mail28: ImageVector
  get() {
    if (_mail28 != null) {
      return _mail28!!
    }
    _mail28 = fluentIcon(name = "Regular.Mail28", 28f) {
      materialPath {
          moveTo(6.25F, 5.0F)
          horizontalLineToRelative(15.5F)
          curveToRelative(1.733F, 0.0F, 3.15F, 1.356F, 3.245F, 3.066F)
          lineTo(25.0F, 8.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.733F, -1.357F, 3.15F, -3.066F, 3.245F)
          lineTo(21.75F, 23.0F)
          horizontalLineTo(6.25F)
          curveToRelative(-1.733F, 0.0F, -3.15F, -1.357F, -3.245F, -3.066F)
          lineTo(3.0F, 19.75F)
          verticalLineTo(8.25F)
          curveTo(3.0F, 6.517F, 4.356F, 5.1F, 6.066F, 5.005F)
          lineTo(6.25F, 5.0F)
          horizontalLineToRelative(15.5F)
          close()
          moveToRelative(17.25F, 5.905F)
          lineToRelative(-9.154F, 4.76F)
          curveToRelative(-0.18F, 0.094F, -0.39F, 0.11F, -0.58F, 0.047F)
          lineToRelative(-0.112F, -0.047F)
          lineToRelative(-9.154F, -4.76F)
          verticalLineToRelative(8.845F)
          curveToRelative(0.0F, 0.918F, 0.707F, 1.671F, 1.606F, 1.744F)
          lineTo(6.25F, 21.5F)
          horizontalLineToRelative(15.5F)
          curveToRelative(0.918F, 0.0F, 1.671F, -0.707F, 1.744F, -1.607F)
          lineTo(23.5F, 19.75F)
          verticalLineToRelative(-8.845F)
          close()
          moveTo(21.75F, 6.5F)
          horizontalLineTo(6.25F)
          curveToRelative(-0.918F, 0.0F, -1.671F, 0.707F, -1.744F, 1.607F)
          lineTo(4.5F, 8.25F)
          verticalLineToRelative(0.964F)
          lineToRelative(9.5F, 4.94F)
          lineToRelative(9.5F, -4.94F)
          verticalLineTo(8.25F)
          curveToRelative(0.0F, -0.918F, -0.707F, -1.671F, -1.607F, -1.744F)
          lineTo(21.75F, 6.5F)
          close()        
      }
    }
    return _mail28!!
  }

private var _mail28: ImageVector? = null
