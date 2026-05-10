package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SmilePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 11f)
                verticalLineToRelative(1f)
                arcToRelative(10f, 10f, 0f, true, true, -9f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                reflectiveCurveToRelative(1.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(4f, -2f, 4f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(9.01f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(15.01f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.SmilePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SmilePlus: ImageVector
    @Composable get() = SmilePlusDefinition.asImageVector()
