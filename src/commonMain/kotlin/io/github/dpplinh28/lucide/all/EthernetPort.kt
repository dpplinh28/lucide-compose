package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EthernetPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 20f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.EthernetPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EthernetPort: ImageVector
    @Composable get() = EthernetPortDefinition.asImageVector()
