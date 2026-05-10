package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 20f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 10f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.BinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binary: ImageVector
    @Composable get() = BinaryDefinition.asImageVector()
