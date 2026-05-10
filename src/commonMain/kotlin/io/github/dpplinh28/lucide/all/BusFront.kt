package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BusFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 6f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 6f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-2f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 11f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 19f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 21f)
                verticalLineToRelative(-2f)
            }
}

public val LucideIcons.All.BusFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BusFront: ImageVector
    @Composable get() = BusFrontDefinition.asImageVector()
