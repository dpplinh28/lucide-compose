package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Kayak") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.97f, 3.61f)
                arcToRelative(.45f, .45f, 0f, false, false, -.58f, -.58f)
                curveTo(10.2f, 6.6f, 6.6f, 10.2f, 3.03f, 20.39f)
                arcToRelative(.45f, .45f, 0f, false, false, .58f, .58f)
                curveTo(13.8f, 17.4f, 17.4f, 13.8f, 20.97f, 3.61f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.707f, 6.707f)
                lineToRelative(10.586f, 10.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 5f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
}

public val LucideIcons.All.KayakDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Kayak: ImageVector
    @Composable get() = KayakDefinition.asImageVector()
