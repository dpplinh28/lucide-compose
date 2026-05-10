package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandGrab") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 11.5f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 10f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9.9f)
                verticalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 14f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                horizontalLineToRelative(-4f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, -8f)
                arcToRelative(2f, 2f, 0f, true, true, 4f, 0f)
            }
}

public val LucideIcons.All.HandGrabDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandGrab: ImageVector
    @Composable get() = HandGrabDefinition.asImageVector()
