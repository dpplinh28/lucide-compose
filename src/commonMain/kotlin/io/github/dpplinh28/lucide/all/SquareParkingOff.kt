package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.6f, 3.6f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -.59f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 8.7f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 13f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
                verticalLineToRelative(-2.3f)
            }
}

public val LucideIcons.All.SquareParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareParkingOff: ImageVector
    @Composable get() = SquareParkingOffDefinition.asImageVector()
