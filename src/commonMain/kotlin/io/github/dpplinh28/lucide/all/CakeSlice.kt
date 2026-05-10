package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CakeSlice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 13f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 17f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.2f, 7.9f)
                lineToRelative(-3.388f, 2.5f)
                arcTo(2f, 2f, 0f, false, false, 3f, 12.01f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-8.654f)
                curveToRelative(0f, -2f, -2.44f, -6.026f, -6.44f, -8.026f)
                arcToRelative(1f, 1f, 0f, false, false, -1.082f, .057f)
                lineTo(10.4f, 5.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.CakeSliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CakeSlice: ImageVector
    @Composable get() = CakeSliceDefinition.asImageVector()
