package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(21f, 8f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.5f, -3.7f)
                arcTo(2f, 2f, 0f, false, false, 15.646f, 5f)
                horizontalLineTo(8.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.903f, 1.257f)
                lineTo(5f, 10f)
                lineTo(3f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 18f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.CarFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarFront: ImageVector
    @Composable get() = CarFrontDefinition.asImageVector()
