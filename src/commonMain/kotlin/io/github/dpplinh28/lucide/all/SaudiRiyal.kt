package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaudiRiyal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(20f, 19.5f)
                lineToRelative(-5.5f, 1.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 4f)
                verticalLineToRelative(11.22f)
                arcToRelative(1f, 1f, 0f, false, false, 1.242f, .97f)
                lineTo(20f, 15.2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2.978f, 19.351f)
                lineToRelative(5.549f, -1.363f)
                arcTo(2f, 2f, 0f, false, false, 10f, 16f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 10f)
                lineTo(4f, 13.5f)
            }
}

public val LucideIcons.All.SaudiRiyalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaudiRiyal: ImageVector
    @Composable get() = SaudiRiyalDefinition.asImageVector()
