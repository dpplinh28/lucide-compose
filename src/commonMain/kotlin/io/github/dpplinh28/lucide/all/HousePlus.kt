package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HousePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.35f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-9f)
                arcToRelative(2f, 2f, 0f, false, true, .71f, -1.53f)
                lineToRelative(7f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.58f, 0f)
                lineToRelative(7f, 6f)
                arcTo(2f, 2f, 0f, false, true, 21f, 10f)
                verticalLineToRelative(2.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.8f, 12.4f)
                arcTo(1f, 1f, 0f, false, false, 14f, 12f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.HousePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HousePlus: ImageVector
    @Composable get() = HousePlusDefinition.asImageVector()
